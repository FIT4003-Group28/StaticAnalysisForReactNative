package defpackage;

import com.facebook.yoga.YogaNative;
/* compiled from: PG */
/* renamed from: dcx  reason: default package */
/* loaded from: classes3.dex */
public final class dcx {
    public static volatile dcw a;
    public static volatile dcv b;
    public static final dmz c;

    static {
        dmz dmzVar = new dmz();
        YogaNative.jni_YGConfigSetUseWebDefaults(dmzVar.a, true);
        c = dmzVar;
    }
}
