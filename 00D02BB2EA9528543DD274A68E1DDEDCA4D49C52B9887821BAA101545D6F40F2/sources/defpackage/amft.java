package defpackage;

import android.graphics.Picture;
import java.io.ByteArrayInputStream;
/* compiled from: PG */
/* renamed from: amft  reason: default package */
/* loaded from: classes2.dex */
public final class amft extends amfp<Picture> {
    final /* synthetic */ amfu a;
    private final byte[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amft(amfu amfuVar, byte[] bArr) {
        super(amfuVar);
        this.a = amfuVar;
        this.d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amfp
    public final /* bridge */ /* synthetic */ dbrn a(Picture picture) {
        final Picture picture2 = picture;
        return new dbrn(this, picture2) { // from class: amfr
            private final amft a;
            private final Picture b;

            {
                this.a = this;
                this.b = picture2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                amft amftVar = this.a;
                bvlw bvlwVar = (bvlw) obj;
                return new amfs(new Object[]{amftVar.a.g, bvlwVar}, this.b, bvlwVar);
            }
        };
    }

    @Override // defpackage.amfp
    @dzsi
    protected final /* bridge */ /* synthetic */ Picture b() {
        try {
            dxeh dxehVar = new dxeh();
            dxehVar.b();
            dxehVar.a = new ByteArrayInputStream(this.d);
            dxehVar.b = true;
            return dxehVar.a().a;
        } catch (dxeg e) {
            bvoo.i(e);
            return null;
        }
    }
}
