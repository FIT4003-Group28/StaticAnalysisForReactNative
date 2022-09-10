package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amfm  reason: default package */
/* loaded from: classes.dex */
public abstract class amfm extends amfp<Bitmap> {
    final /* synthetic */ amfu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amfm(amfu amfuVar) {
        super(amfuVar);
        this.a = amfuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amfp
    public final /* bridge */ /* synthetic */ dbrn a(Bitmap bitmap) {
        final Bitmap bitmap2 = bitmap;
        return new dbrn(this, bitmap2) { // from class: amfk
            private final amfm a;
            private final Bitmap b;

            {
                this.a = this;
                this.b = bitmap2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                amfm amfmVar = this.a;
                bvlw bvlwVar = (bvlw) obj;
                return new amfl(new Object[]{amfmVar.a.g}, this.b);
            }
        };
    }
}
