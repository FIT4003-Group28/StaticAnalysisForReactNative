package defpackage;

import android.content.Context;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: bnla  reason: default package */
/* loaded from: classes3.dex */
public final class bnla extends itb {
    private final Context a;
    private final dzsj<bnks> b;
    private final dzsj<btvo> c;
    private boolean d = false;

    public bnla(Context context, dzsj<bnks> dzsjVar, dzsj<btvo> dzsjVar2) {
        this.a = context;
        this.b = dzsjVar;
        this.c = dzsjVar2;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (this.c.a().getEnableFeatureParameters().aV) {
            this.a.registerReceiver(this.b.a(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
            this.d = true;
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        if (this.d) {
            try {
                this.a.unregisterReceiver(this.b.a());
                this.d = false;
            } catch (IllegalArgumentException e) {
                bvoo.f(e);
            }
        }
    }
}
