package defpackage;

import defpackage.bxeq;
import defpackage.ges;
/* compiled from: PG */
/* renamed from: cgys  reason: default package */
/* loaded from: classes4.dex */
public class cgys<T extends ges & bxeq> extends bont<T> implements cgvy {
    private final cgyr a;
    private final String b;
    private boolean c;

    public cgys(T t, ddho ddhoVar, String str, bwqv bwqvVar, cgyr cgyrVar) {
        super(t, new bowt(), ddhoVar, true, "", false, bwqvVar);
        this.b = str;
        this.a = cgyrVar;
    }

    @Override // defpackage.bont, defpackage.boqb
    public cqkl a() {
        if (!this.c) {
            cgwz cgwzVar = ((cgwy) this.a).a;
            cgwzVar.l.H(cgwzVar);
            return super.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.cgvy
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bont, defpackage.boqm
    public String h() {
        return this.b;
    }

    public void r(boolean z) {
        this.c = z;
        cqkx.p(this);
    }
}
