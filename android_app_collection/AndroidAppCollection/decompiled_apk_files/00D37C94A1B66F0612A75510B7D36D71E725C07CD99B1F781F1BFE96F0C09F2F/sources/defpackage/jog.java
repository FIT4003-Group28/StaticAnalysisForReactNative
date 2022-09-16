package defpackage;
/* compiled from: PG */
/* renamed from: jog  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jog implements anir {
    public final /* synthetic */ joh a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ jog(joh johVar, String str) {
        this.a = johVar;
        this.b = str;
    }

    public /* synthetic */ jog(joh johVar, String str, int i) {
        this.c = i;
        this.a = johVar;
        this.b = str;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            Void r3 = (Void) obj;
            this.a.a.d(new jiz(this.b));
            return ankq.a;
        }
        Void r32 = (Void) obj;
        this.a.a.d(new jiy(this.b));
        return ankq.a;
    }
}
