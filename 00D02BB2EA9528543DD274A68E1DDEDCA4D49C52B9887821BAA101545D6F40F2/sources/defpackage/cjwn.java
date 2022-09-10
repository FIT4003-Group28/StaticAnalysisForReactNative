package defpackage;
/* compiled from: PG */
/* renamed from: cjwn  reason: default package */
/* loaded from: classes.dex */
public abstract class cjwn implements cjws {
    public final cqat a;

    public cjwn(cqat cqatVar) {
        this.a = cqatVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(cjqy cjqyVar, ddda dddaVar, long j) {
        cjqyVar.u(new cjtw(this.a.e(), dddaVar, this.a.e() - j));
    }
}
