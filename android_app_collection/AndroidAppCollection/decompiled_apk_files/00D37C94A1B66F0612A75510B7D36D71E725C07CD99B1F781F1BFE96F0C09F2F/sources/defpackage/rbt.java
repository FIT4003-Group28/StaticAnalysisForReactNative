package defpackage;

import android.os.IInterface;
/* compiled from: PG */
/* renamed from: rbt  reason: default package */
/* loaded from: classes4.dex */
public interface rbt extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(rad radVar);
}
