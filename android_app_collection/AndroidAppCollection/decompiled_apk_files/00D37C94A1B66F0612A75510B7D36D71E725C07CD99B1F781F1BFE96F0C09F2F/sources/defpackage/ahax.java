package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahax  reason: default package */
/* loaded from: classes.dex */
public final class ahax implements ahda {
    final /* synthetic */ String a;
    final /* synthetic */ attl b;
    final /* synthetic */ agqn c;
    final /* synthetic */ byte[] d;
    final /* synthetic */ ahbb e;

    public ahax(ahbb ahbbVar, String str, attl attlVar, agqn agqnVar, byte[] bArr) {
        this.e = ahbbVar;
        this.a = str;
        this.b = attlVar;
        this.c = agqnVar;
        this.d = bArr;
    }

    @Override // defpackage.ahda
    public final void a() {
    }

    @Override // defpackage.ahda
    public final void b() {
        ahbb ahbbVar = this.e;
        String str = this.a;
        attl attlVar = this.b;
        agqn agqnVar = this.c;
        byte[] bArr = this.d;
        ahbbVar.e.p();
        this.e.l(ahbbVar.d().B(str, attlVar, agqnVar, bArr, -1, 2));
    }
}
