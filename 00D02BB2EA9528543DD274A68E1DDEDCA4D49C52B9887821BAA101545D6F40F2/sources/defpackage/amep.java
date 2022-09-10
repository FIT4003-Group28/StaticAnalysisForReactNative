package defpackage;
/* compiled from: PG */
/* renamed from: amep  reason: default package */
/* loaded from: classes.dex */
final class amep implements dbty<bsa> {
    final /* synthetic */ amfd a;

    public amep(amfd amfdVar) {
        this.a = amfdVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ bsa a() {
        bsa d = brc.d(this.a.a);
        d.p(new chw().t(btz.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"), 7500));
        return d;
    }
}
