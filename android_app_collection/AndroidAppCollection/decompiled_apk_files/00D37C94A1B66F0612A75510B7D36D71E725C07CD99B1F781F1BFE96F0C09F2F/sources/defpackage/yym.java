package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yym  reason: default package */
/* loaded from: classes4.dex */
public class yym implements yiw {
    private final yyo a;
    public final ImageView b;
    private final yyr c;
    private final Animation d;
    private boolean e;

    public yym(ImageView imageView, yyo yyoVar, yyr yyrVar) {
        this.b = imageView;
        yyoVar.getClass();
        this.a = yyoVar;
        this.c = yyrVar;
        Animation b = yyoVar.b();
        this.d = b;
        if (b != null) {
            b.setAnimationListener(new yyl(this));
        }
        imageView.setTag(R.id.bitmap_loader_tag, this);
        this.e = false;
    }

    private final void d() {
        this.b.setTag(R.id.bitmap_loader_tag, null);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        if (this.b.getTag(R.id.bitmap_loader_tag) != this) {
            yyr yyrVar = this.c;
            if (!(yyrVar instanceof ajmn)) {
                return;
            }
            ((ajmn) yyrVar).a(this.b);
            return;
        }
        yyr yyrVar2 = this.c;
        if (yyrVar2 != null) {
            yyrVar2.d(this.b);
        }
        yyr yyrVar3 = this.c;
        if ((yyrVar3 instanceof ajmn) && ((ajmn) yyrVar3).e.b) {
            ajna.a(new ajmz(exc, uri, "Default"));
        }
        d();
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (this.b.getTag(R.id.bitmap_loader_tag) != this) {
            yyr yyrVar = this.c;
            if (!(yyrVar instanceof ajmn)) {
                return;
            }
            ((ajmn) yyrVar).a(this.b);
            return;
        }
        bitmap.prepareToDraw();
        this.e = true;
        this.a.a(this.b, bitmap);
        yyr yyrVar2 = this.c;
        if (yyrVar2 != null) {
            yyrVar2.f(this.b);
        }
        if (uri.equals(this.b.getTag(R.id.bitmap_source_tag)) || this.d == null) {
            c();
            return;
        }
        this.b.setTag(R.id.bitmap_source_tag, uri);
        if (this.d.hasStarted() && !this.d.hasEnded()) {
            this.d.cancel();
            this.d.reset();
        }
        if (this.b.hasOverlappingRendering()) {
            this.b.setLayerType(2, null);
        }
        this.b.startAnimation(this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (!this.e) {
            zep.l("Ignoring onBitmapRendered called before onResponse.");
        } else if (this.b.getTag(R.id.bitmap_loader_tag) != this) {
        } else {
            this.b.invalidate();
            yyr yyrVar = this.c;
            if (yyrVar != null) {
                yyrVar.g();
            }
            d();
        }
    }
}
