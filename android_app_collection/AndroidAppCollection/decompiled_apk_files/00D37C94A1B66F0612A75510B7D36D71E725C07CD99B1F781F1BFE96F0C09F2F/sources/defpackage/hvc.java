package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hvc  reason: default package */
/* loaded from: classes3.dex */
final class hvc implements yiw {
    final /* synthetic */ axaj a;
    final /* synthetic */ hvd b;

    public hvc(hvd hvdVar, axaj axajVar) {
        this.b = hvdVar;
        this.a = axajVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        afus.b(2, 24, "VideoFX: Secondary sticker load failed");
        this.b.f.aR(this.a.mo52toBuilder());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        axac axacVar;
        axac axacVar2;
        Uri uri = (Uri) obj;
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(this.b.d, (Resources.Theme) null));
        ImageView imageView = (ImageView) from.inflate(R.layout.day_of_week_sticker, (ViewGroup) null);
        imageView.setImageDrawable((Drawable) obj2);
        Bitmap c = aakr.c(from.getContext(), imageView);
        final hvd hvdVar = this.b;
        axaj axajVar = this.a;
        axbm c2 = axajVar.c();
        axbk i = c2.i();
        if (i.c == 12) {
            axacVar = (axac) i.d;
        } else {
            axacVar = axac.a;
        }
        axad axadVar = axacVar.d;
        if (axadVar == null) {
            axadVar = axad.b;
        }
        aopa mo52toBuilder = axadVar.mo52toBuilder();
        axae axaeVar = hvdVar.i;
        mo52toBuilder.copyOnWrite();
        axad axadVar2 = (axad) mo52toBuilder.instance;
        axadVar2.d = axaeVar.d;
        axadVar2.c |= 1;
        axad axadVar3 = (axad) mo52toBuilder.mo39build();
        String c3 = hve.c(uri);
        axbl axblVar = (axbl) c2.mo52toBuilder();
        aopa mo52toBuilder2 = c2.i().mo52toBuilder();
        axbk i2 = c2.i();
        if (i2.c == 12) {
            axacVar2 = (axac) i2.d;
        } else {
            axacVar2 = axac.a;
        }
        aopa mo52toBuilder3 = axacVar2.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        axac axacVar3 = (axac) mo52toBuilder3.instance;
        axadVar3.getClass();
        axacVar3.d = axadVar3;
        axacVar3.b |= 2;
        aopa createBuilder = awzs.a.createBuilder();
        createBuilder.copyOnWrite();
        awzs awzsVar = (awzs) createBuilder.instance;
        c3.getClass();
        awzsVar.b = 1;
        awzsVar.c = c3;
        awzs awzsVar2 = (awzs) createBuilder.mo39build();
        mo52toBuilder3.copyOnWrite();
        axac axacVar4 = (axac) mo52toBuilder3.instance;
        awzsVar2.getClass();
        axacVar4.c = awzsVar2;
        axacVar4.b |= 1;
        mo52toBuilder2.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder2.instance;
        axac axacVar5 = (axac) mo52toBuilder3.mo39build();
        axacVar5.getClass();
        axbkVar.d = axacVar5;
        axbkVar.c = 12;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder2.mo39build());
        final aopa mo52toBuilder4 = axajVar.mo52toBuilder();
        mo52toBuilder4.copyOnWrite();
        ((axaj) mo52toBuilder4.instance).e((axbm) axblVar.mo39build());
        hxb.d(hvdVar.d, c, axblVar, new hvg() { // from class: hva
            @Override // defpackage.hvg
            public final void a(axbl axblVar2) {
                hvd hvdVar2 = hvd.this;
                aopa aopaVar = mo52toBuilder4;
                aopaVar.copyOnWrite();
                ((axaj) aopaVar.instance).e((axbm) axblVar2.mo39build());
                hvdVar2.f.aR(aopaVar);
            }
        });
    }
}
