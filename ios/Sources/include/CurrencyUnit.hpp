// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

#ifndef DJINNI_GENERATED_CURRENCYUNIT_HPP
#define DJINNI_GENERATED_CURRENCYUNIT_HPP

#include <cstdint>
#include <iostream>
#include <string>
#include <utility>

namespace ledger { namespace core { namespace api {

/** Structure of cryptocurrency unit. */
struct CurrencyUnit final {
    /** Currency name, e.g. milli-bitcoin. */
    std::string name;
    /** UTF-8 (hex) currency symbol, e.g. hex code for m₿. */
    std::string symbol;
    /** Currency code, e.g. mBTC. */
    std::string code;
    /** Number of decimal to display. */
    int32_t numberOfDecimal;

    CurrencyUnit(std::string name_,
                 std::string symbol_,
                 std::string code_,
                 int32_t numberOfDecimal_)
    : name(std::move(name_))
    , symbol(std::move(symbol_))
    , code(std::move(code_))
    , numberOfDecimal(std::move(numberOfDecimal_))
    {}

    CurrencyUnit(const CurrencyUnit& cpy) {
       this->name = cpy.name;
       this->symbol = cpy.symbol;
       this->code = cpy.code;
       this->numberOfDecimal = cpy.numberOfDecimal;
    }

    CurrencyUnit() = default;


    CurrencyUnit& operator=(const CurrencyUnit& cpy) {
       this->name = cpy.name;
       this->symbol = cpy.symbol;
       this->code = cpy.code;
       this->numberOfDecimal = cpy.numberOfDecimal;
       return *this;
    }

    template <class Archive>
    void load(Archive& archive) {
        archive(name, symbol, code, numberOfDecimal);
    }

    template <class Archive>
    void save(Archive& archive) const {
        archive(name, symbol, code, numberOfDecimal);
    }
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_CURRENCYUNIT_HPP
