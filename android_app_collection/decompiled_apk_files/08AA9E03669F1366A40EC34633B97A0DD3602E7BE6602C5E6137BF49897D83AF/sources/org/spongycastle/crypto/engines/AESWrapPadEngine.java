package org.spongycastle.crypto.engines;
/* loaded from: classes.dex */
public class AESWrapPadEngine extends RFC5649WrapEngine {
    public AESWrapPadEngine() {
        super(new AESEngine());
    }
}
