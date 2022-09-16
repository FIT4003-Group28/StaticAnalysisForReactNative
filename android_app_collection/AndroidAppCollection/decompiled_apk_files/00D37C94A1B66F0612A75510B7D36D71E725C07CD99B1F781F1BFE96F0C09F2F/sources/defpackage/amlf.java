package defpackage;

import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amlf  reason: default package */
/* loaded from: classes.dex */
public final class amlf extends amkk implements amkx {
    private final Exception c;
    private final boolean d;

    public amlf(String str, amkx amkxVar, amlt amltVar, boolean z) {
        super(str, amkxVar, amltVar);
        this.c = amkxVar.e();
        this.d = z;
    }

    @Override // defpackage.amkx
    public final amlv d(String str, amlt amltVar, boolean z) {
        if (z && !this.d) {
            WeakHashMap weakHashMap = amna.a;
        }
        boolean z2 = true;
        if ((!z || this.d) && !this.d) {
            z2 = false;
        }
        return new amlf(str, this, amltVar, z2);
    }

    @Override // defpackage.amkx
    public final Exception e() {
        return this.c;
    }

    @Override // defpackage.amlv
    public final amlv f(String str, amlt amltVar) {
        return d(str, amltVar, true);
    }

    @Override // defpackage.amlv
    public final void g(boolean z) {
    }

    public amlf(String str, amlt amltVar, boolean z) {
        super(str, amky.a.b(), amltVar);
        this.c = amle.c;
        this.d = z;
    }
}
