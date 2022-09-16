package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jpz  reason: default package */
/* loaded from: classes3.dex */
public final class jpz implements ezl {
    public final dt a;
    public final fcl b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public ProgressBar h;
    public akbm i;
    public Button j;
    public ios k;
    private final akbn l;
    private final FrameLayout m;
    private boolean n;

    public jpz(dt dtVar, fcl fclVar, akbn akbnVar, FrameLayout frameLayout) {
        this.a = dtVar;
        this.b = fclVar;
        this.l = akbnVar;
        this.m = frameLayout;
    }

    public static apoj b(String str, apzg apzgVar) {
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        apojVar.d = 2;
        apojVar.c = 1;
        aopcVar.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar.instance;
        apojVar2.e = 3;
        apojVar2.b |= 8;
        arag g = ajgl.g(str);
        aopcVar.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar.instance;
        g.getClass();
        apojVar3.i = g;
        apojVar3.b |= 256;
        aopcVar.copyOnWrite();
        apoj apojVar4 = (apoj) aopcVar.instance;
        apzgVar.getClass();
        apojVar4.o = apzgVar;
        apojVar4.b |= 16384;
        return (apoj) aopcVar.mo39build();
    }

    public static void c(acti actiVar, actj actjVar) {
        if (actiVar == null) {
            zep.b("No valid interaction logger.");
        } else {
            actiVar.n(new acte(actjVar));
        }
    }

    @Override // defpackage.ezl
    public final void a(acti actiVar) {
        f(false, actiVar);
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(this.a.getString(R.string.offline_retry));
            this.g.setOnClickListener(new View.OnClickListener() { // from class: jpw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ios iosVar = jpz.this.k;
                    if (iosVar != null) {
                        iosVar.a();
                    }
                }
            });
            this.g.setVisibility(0);
            c(actiVar, actj.OFFLINE_ZERO_STATE_SCREEN_RETRY_BUTTON);
        }
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void d() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.d = (TextView) this.m.findViewById(R.id.error_message_text);
        this.c = (ImageView) this.m.findViewById(R.id.error_icon);
        this.e = (TextView) this.m.findViewById(R.id.error_sub_message_text);
        TextView textView = (TextView) this.m.findViewById(R.id.link_button);
        this.f = textView;
        this.i = this.l.a(textView);
        this.j = (Button) this.m.findViewById(R.id.error_retry_button);
        this.g = (TextView) ((ViewStub) this.m.findViewById(R.id.secondary_retry_button_stub)).inflate();
        this.h = (ProgressBar) ((ViewStub) this.m.findViewById(R.id.load_spinner_stub)).inflate();
    }

    public final void e() {
        d();
        this.d.setText(this.a.getString(R.string.offline_no_content_title_not_offline_eligible));
        this.c.setImageResource(2131231724);
        this.e.setText(this.a.getString(R.string.offline_no_content_body_text_not_offline_eligible));
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.j.setVisibility(8);
    }

    public final void f(final boolean z, final acti actiVar) {
        final boolean h = this.b.h();
        ylx.n(this.a, this.b.b(), new zdt() { // from class: jpx
            @Override // defpackage.zdt
            public final void a(Object obj) {
                jpz.this.e();
                zep.d("Failed to get has offline access.", (Throwable) obj);
            }
        }, new zdt() { // from class: jpy
            @Override // defpackage.zdt
            public final void a(Object obj) {
                jpz jpzVar = jpz.this;
                boolean z2 = h;
                boolean z3 = z;
                acti actiVar2 = actiVar;
                Boolean bool = (Boolean) obj;
                if (z2 || Boolean.TRUE.equals(bool)) {
                    jpzVar.d();
                    jpzVar.c.setImageResource(2131231723);
                    if (z2) {
                        jpzVar.d.setText(jpzVar.a.getString(R.string.offline_no_content_title_offline_eligible_and_has_content));
                        if (jpzVar.b.n()) {
                            jpzVar.d.setText(R.string.offline_no_content_title_has_download_recommendations);
                            jpzVar.e.setText(R.string.offline_no_content_body_text_has_download_recommendations);
                            jpzVar.i.b(jpz.b(jpzVar.a.getString(R.string.offline_no_content_button_text_has_download_recommendations), far.a), null);
                        } else if (jpzVar.b.e()) {
                            jpzVar.e.setText(R.string.offline_no_content_body_text_has_both_downloads_and_recommendations);
                            jpzVar.i.b(jpz.b(jpzVar.a.getString(R.string.offline_no_content_button_text_has_download_recommendations), far.a), null);
                        } else {
                            jpzVar.e.setText(jpzVar.a.getString(R.string.offline_navigate_to_downloads_detail_text));
                            jpzVar.i.b(jpz.b(jpzVar.a.getString(R.string.offline_navigate_to_downloads_action_text), far.a), null);
                        }
                        jpzVar.f.setVisibility(0);
                        if (!z3) {
                            jpz.c(actiVar2, actj.OFFLINE_ZERO_STATE_SCREEN_GOTO_BUTTON);
                        }
                    } else {
                        jpzVar.d.setText(jpzVar.a.getString(R.string.offline_no_content_title_offline_eligible_and_no_content));
                        jpzVar.e.setText(jpzVar.a.getString(R.string.offline_no_content_body_text_offline_eligible_and_no_content));
                        jpzVar.f.setVisibility(8);
                    }
                    jpzVar.e.setVisibility(0);
                    jpzVar.j.setVisibility(8);
                    return;
                }
                jpzVar.e();
            }
        });
    }
}
