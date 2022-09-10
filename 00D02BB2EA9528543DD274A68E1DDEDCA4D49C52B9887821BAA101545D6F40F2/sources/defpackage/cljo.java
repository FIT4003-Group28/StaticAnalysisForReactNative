package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cljo  reason: default package */
/* loaded from: classes5.dex */
public final class cljo implements cllf {
    private static final dcep<String> b = dcep.B("data");
    public final dehp a;

    public cljo(dehp dehpVar) {
        this.a = dehpVar;
    }

    @Override // defpackage.cllf
    public final cllg a(String str) {
        return new cljl(this, str);
    }

    @Override // defpackage.cllf
    public final Set<String> b() {
        return b;
    }
}
