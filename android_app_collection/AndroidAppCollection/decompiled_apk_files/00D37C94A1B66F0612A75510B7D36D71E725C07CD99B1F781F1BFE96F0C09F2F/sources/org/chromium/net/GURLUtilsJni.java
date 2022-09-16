package org.chromium.net;

import J.N;
import org.chromium.net.GURLUtils;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    public static final bacb TEST_HOOKS = new bacz();
    private static GURLUtils.Natives testInstance;

    public static GURLUtils.Natives get() {
        return new GURLUtilsJni();
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return N.MpCt7siL(str);
    }
}
