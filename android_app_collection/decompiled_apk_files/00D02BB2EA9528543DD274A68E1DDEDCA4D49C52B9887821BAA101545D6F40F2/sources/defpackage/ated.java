package defpackage;
/* compiled from: PG */
/* renamed from: ated  reason: default package */
/* loaded from: classes2.dex */
public class ated {
    private final atec a;
    private final atec b;
    private final atec c;
    private final atec d;
    @dzsi
    private final atec e;
    @dzsi
    private final atec f;
    @dzsi
    private final atec g;
    @dzsi
    private final atec h;

    public ated(atec atecVar, atec atecVar2, atec atecVar3, atec atecVar4) {
        this(atecVar, atecVar2, atecVar3, atecVar4, null, null, null, null);
    }

    public ated(atec atecVar, atec atecVar2, atec atecVar3, atec atecVar4, @dzsi atec atecVar5, @dzsi atec atecVar6, @dzsi atec atecVar7, @dzsi atec atecVar8) {
        this.a = atecVar;
        this.b = atecVar2;
        this.c = atecVar3;
        this.d = atecVar4;
        this.e = atecVar5;
        this.f = atecVar6;
        this.g = atecVar7;
        this.h = atecVar8;
    }

    public final atec a(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.a : this.c;
    }

    @dzsi
    public final atec b(boolean z, boolean z2) {
        return z ? z2 ? this.f : this.h : z2 ? this.e : this.g;
    }
}
