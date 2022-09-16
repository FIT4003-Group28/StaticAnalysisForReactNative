package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
/* compiled from: PG */
/* renamed from: hul  reason: default package */
/* loaded from: classes3.dex */
public final class hul implements yiw {
    final /* synthetic */ View a;
    final /* synthetic */ VideoSelectedActionOuterClass$VideoSelectedAction b;
    final /* synthetic */ hun c;

    public hul(hun hunVar, View view, VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction) {
        this.c = hunVar;
        this.a = view;
        this.b = videoSelectedActionOuterClass$VideoSelectedAction;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        zag.q(this.c.a, R.string.reel_generic_error_message, 0);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        View view = this.a;
        if (view != null) {
            hm j = iy.j(view.getResources(), bitmap);
            j.d();
            ((ImageView) view.findViewById(R.id.thumbnail)).setImageDrawable(j);
        }
        final hun hunVar = this.c;
        View view2 = this.a;
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction = this.b;
        if (hunVar.j != null) {
            hunVar.f.post(new Runnable() { // from class: huk
                @Override // java.lang.Runnable
                public final void run() {
                    hun.this.j.a();
                }
            });
        }
        if (view2 == null) {
            return;
        }
        aopa createBuilder = axbk.a.createBuilder();
        boolean z = hunVar.i;
        createBuilder.copyOnWrite();
        axbk axbkVar = (axbk) createBuilder.instance;
        axbkVar.b |= 4096;
        axbkVar.e = z;
        aopa createBuilder2 = axck.a.createBuilder();
        boolean z2 = videoSelectedActionOuterClass$VideoSelectedAction.c;
        createBuilder2.copyOnWrite();
        axck axckVar = (axck) createBuilder2.instance;
        axckVar.b |= 2;
        axckVar.d = z2;
        axck axckVar2 = (axck) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        axbk axbkVar2 = (axbk) createBuilder.instance;
        axckVar2.getClass();
        axbkVar2.d = axckVar2;
        axbkVar2.c = 10;
        axbl j2 = axbm.j();
        j2.copyOnWrite();
        ((axbm) j2.instance).F((axbk) createBuilder.mo39build());
        Matrix matrix = new Matrix();
        matrix.preScale(0.5f, 0.5f, 0.5f, 0.5f);
        aotm e = aahp.e(matrix);
        j2.copyOnWrite();
        ((axbm) j2.instance).E(e);
        aopa createBuilder3 = axax.a.createBuilder();
        createBuilder3.copyOnWrite();
        axax axaxVar = (axax) createBuilder3.instance;
        axaxVar.e = 2;
        axaxVar.b |= 1;
        aopa createBuilder4 = axaw.a.createBuilder();
        String str = videoSelectedActionOuterClass$VideoSelectedAction.b;
        createBuilder4.copyOnWrite();
        axaw axawVar = (axaw) createBuilder4.instance;
        str.getClass();
        axawVar.b |= 1;
        axawVar.c = str;
        createBuilder3.copyOnWrite();
        axax axaxVar2 = (axax) createBuilder3.instance;
        axaw axawVar2 = (axaw) createBuilder4.mo39build();
        axawVar2.getClass();
        axaxVar2.d = axawVar2;
        axaxVar2.c = 4;
        aopa createBuilder5 = axav.a.createBuilder();
        aotm f = aahp.f();
        createBuilder5.copyOnWrite();
        axav axavVar = (axav) createBuilder5.instance;
        f.getClass();
        axavVar.c = f;
        axavVar.b = 1;
        createBuilder3.bA(createBuilder5);
        j2.a((axax) createBuilder3.mo39build());
        hxb.e(hunVar.a, hunVar.k, view2, j2, new huy(hunVar.b, 1));
    }
}
