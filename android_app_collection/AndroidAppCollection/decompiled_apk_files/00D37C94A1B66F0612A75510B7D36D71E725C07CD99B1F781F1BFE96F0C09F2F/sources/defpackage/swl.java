package defpackage;

import com.facebook.yoga.YogaEdge;
/* compiled from: PG */
/* renamed from: swl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class swl implements tfn {
    public final /* synthetic */ swy a;
    private final /* synthetic */ int b;

    public /* synthetic */ swl(swy swyVar, int i) {
        this.b = i;
        this.a = swyVar;
    }

    @Override // defpackage.tfn
    public final void a(YogaEdge yogaEdge, aodr aodrVar) {
        if (this.b == 0) {
            this.a.z(yogaEdge, aodrVar.b());
        } else {
            this.a.P(yogaEdge, aodrVar.b());
        }
    }
}
