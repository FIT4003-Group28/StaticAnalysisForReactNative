package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jpu  reason: default package */
/* loaded from: classes3.dex */
public final class jpu {
    public final dt a;
    public final akfg b;
    public final aafo c;
    public final joh d;
    public final acth e;
    private final View.OnClickListener g = new jpp(this, 1);
    public final View.OnClickListener f = new jpp(this);

    public jpu(dt dtVar, akfg akfgVar, aafo aafoVar, joh johVar, acth acthVar) {
        this.a = dtVar;
        this.b = akfgVar;
        this.c = aafoVar;
        this.d = johVar;
        this.e = acthVar;
    }

    public final akfh a(int i) {
        return b(this.a.getApplicationContext().getString(i));
    }

    public final akfh b(String str) {
        akfh l = this.b.l();
        l.k(str);
        l.j(false);
        return l;
    }

    public final void c(final String str) {
        akfg akfgVar = this.b;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: jpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jpu jpuVar = jpu.this;
                String str2 = str;
                try {
                    joh johVar = jpuVar.d;
                    anii.i(johVar.a(), new jog(johVar, str2), anjk.a).get();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                    zep.b("Failed to undo delete");
                }
            }
        };
        akfh a = a(R.string.offline_actions_video_deleted_undo_snackbar_text);
        a.m(this.a.getApplicationContext().getString(R.string.offline_undo_snackbar_button_text), onClickListener);
        a.i(4000);
        a.j(false);
        a.l(new jpt(this, str));
        akfgVar.n(a.b());
    }

    public final void d(int i) {
        this.b.n(a(i).b());
    }

    public final void e(int i) {
        akfg akfgVar = this.b;
        View.OnClickListener onClickListener = this.g;
        akfh a = a(i);
        a.m(this.a.getApplicationContext().getString(R.string.offline_actions_snackbar_button_text), onClickListener);
        a.j(false);
        a.l(new jpr(this));
        akfgVar.n(a.b());
    }
}
