package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: odu  reason: default package */
/* loaded from: classes3.dex */
public final class odu {
    public akgj a;
    private final Context b;
    private final fcl c;
    private final LoadingFrameLayout d;
    private final yrj e;
    private final akbn f;
    private final acti g;
    private final boolean h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private akbj n;
    private boolean o;

    public odu(Context context, fcl fclVar, yrj yrjVar, akbn akbnVar, acti actiVar, LoadingFrameLayout loadingFrameLayout, boolean z) {
        this.b = context;
        this.c = fclVar;
        this.e = yrjVar;
        this.f = akbnVar;
        this.g = actiVar;
        this.d = loadingFrameLayout;
        this.h = z;
        if (!z) {
            loadingFrameLayout.g(R.layout.loading_frame_offline_status_view);
        }
    }

    private final void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.j = (TextView) this.d.findViewById(R.id.watch_panel_error_offline_message).findViewById(R.id.error_sub_message_text);
        TextView textView = (TextView) this.d.findViewById(R.id.link_button);
        this.k = textView;
        this.n = this.f.a(textView);
        this.l = (TextView) this.d.findViewById(R.id.error_retry_button);
        this.m = (TextView) ((ViewStub) this.d.findViewById(R.id.secondary_retry_button_stub)).inflate();
    }

    public final void a(aikd aikdVar) {
        if (this.h) {
            this.d.h(null);
        } else if (!this.e.o()) {
            if (this.c.h()) {
                this.d.i(this.b.getString(R.string.offline_no_content_title_offline_eligible_and_has_content), 2131231723);
                b();
                this.j.setText(this.b.getString(R.string.offline_navigate_to_downloads_detail_text));
                akbj akbjVar = this.n;
                String string = this.b.getString(R.string.offline_navigate_to_downloads_action_text);
                apzg apzgVar = far.a;
                aopc aopcVar = (aopc) apoj.a.createBuilder();
                aopcVar.copyOnWrite();
                apoj apojVar = (apoj) aopcVar.instance;
                apojVar.d = 2;
                apojVar.c = 1;
                aopcVar.copyOnWrite();
                apoj apojVar2 = (apoj) aopcVar.instance;
                apojVar2.e = 3;
                apojVar2.b |= 8;
                arag g = ajgl.g(string);
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
                akbjVar.b((apoj) aopcVar.mo39build(), null);
                this.j.setVisibility(0);
                this.k.setVisibility(0);
                this.l.setVisibility(8);
            } else {
                this.d.i(this.b.getString(R.string.offline_no_content_title_not_offline_eligible), 2131231724);
                b();
                this.j.setText(this.b.getString(R.string.offline_no_content_body_text_not_offline_eligible));
                this.j.setVisibility(0);
                this.k.setVisibility(8);
                this.l.setVisibility(8);
            }
            TextView textView = this.m;
            if (textView == null) {
                return;
            }
            textView.setText(this.b.getString(R.string.offline_retry));
            this.m.setOnClickListener(new View.OnClickListener() { // from class: odt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    akgj akgjVar = odu.this.a;
                    if (akgjVar != null) {
                        akgjVar.qX();
                    }
                }
            });
            this.m.setVisibility(0);
            this.g.n(new acte(actj.OFFLINE_ZERO_STATE_SCREEN_RETRY_BUTTON));
        } else {
            this.d.b(aikdVar.d, aikdVar.a);
            if (this.i == null) {
                this.i = (TextView) this.d.findViewById(R.id.error_message_text);
            }
            this.i.setTextSize(zew.h(this.b.getResources().getDisplayMetrics(), this.b.getResources().getDimension(R.dimen.medium_font_size)));
            this.i.setTextColor(this.b.getResources().getColor(R.color.yt_grey3));
            this.i.setTypeface(ajgo.ROBOTO_LIGHT.c(this.b));
        }
    }
}
