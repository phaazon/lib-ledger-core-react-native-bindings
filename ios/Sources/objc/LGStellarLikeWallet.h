// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

#import <Foundation/Foundation.h>
@protocol LGBoolCallback;


@interface LGStellarLikeWallet : NSObject

- (void)exists:(nonnull NSString *)address
      callback:(nullable id<LGBoolCallback>)callback;

@end