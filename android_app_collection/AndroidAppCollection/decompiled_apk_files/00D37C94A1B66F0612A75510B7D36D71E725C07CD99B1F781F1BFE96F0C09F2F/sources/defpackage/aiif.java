package defpackage;
/* compiled from: PG */
/* renamed from: aiif  reason: default package */
/* loaded from: classes.dex */
final class aiif implements akev {
    final /* synthetic */ awgw a;
    final /* synthetic */ aiii b;

    public aiif(aiii aiiiVar, awgw awgwVar) {
        this.b = aiiiVar;
        this.a = awgwVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfi akfiVar = (akfi) obj;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfi akfiVar = (akfi) obj;
        this.b.i(this.a);
        this.b.c(this.a, true);
        this.b.b(awgu.YOU_THERE_EVENT_TYPE_PROMPT_SHOWN, this.a);
        this.b.b(awgu.YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN, this.a);
    }
}
