package com.crashlytics.android.core;

import b.a.a.a.a.e.g;
import java.io.InputStream;
/* loaded from: classes.dex */
class CrashlyticsPinningInfoProvider implements g {
    private final PinningInfoProvider pinningInfo;

    @Override // b.a.a.a.a.e.g
    public long getPinCreationTimeInMillis() {
        return -1L;
    }

    public CrashlyticsPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        this.pinningInfo = pinningInfoProvider;
    }

    @Override // b.a.a.a.a.e.g
    public InputStream getKeyStoreStream() {
        return this.pinningInfo.getKeyStoreStream();
    }

    @Override // b.a.a.a.a.e.g
    public String getKeyStorePassword() {
        return this.pinningInfo.getKeyStorePassword();
    }

    @Override // b.a.a.a.a.e.g
    public String[] getPins() {
        return this.pinningInfo.getPins();
    }
}
