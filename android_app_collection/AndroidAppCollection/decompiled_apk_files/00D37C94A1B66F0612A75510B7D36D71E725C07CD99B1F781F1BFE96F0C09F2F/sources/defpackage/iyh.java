package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iyh  reason: default package */
/* loaded from: classes3.dex */
public final class iyh extends iyg {
    private static final String h = zep.a("MDX.MinibarController");

    public iyh(Context context, azqb azqbVar) {
        super(context, azqbVar);
    }

    private final Spanned c(String str) {
        String string = this.a.getString(R.string.mdx_minibar_next_video_text, str);
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(string, 0);
        }
        return Html.fromHtml(string);
    }

    private final void d() {
        audg audgVar;
        audk audkVar;
        if (!this.f) {
            return;
        }
        TextView textView = this.d;
        TextView textView2 = this.e;
        ViewGroup viewGroup = this.c;
        if (textView == null || textView2 == null || viewGroup == null) {
            return;
        }
        adwj adwjVar = this.g;
        if (adwjVar.e == adwjVar.d - 1) {
            adwh adwhVar = adwjVar.k;
            if (adwhVar.b == 2) {
                PlayerResponseModel playerResponseModel = adwhVar.a;
                if (playerResponseModel == null || amps.e(playerResponseModel.A())) {
                    zep.m(h, "MdxWatchState's watchNext video is either null or does not have a valid title.");
                } else {
                    textView.setText(c(playerResponseModel.A()));
                    textView2.setText(a(this.g));
                    viewGroup.setContentDescription(this.a.getString(R.string.mdx_minibar_accessibility_queue_status_next_video, playerResponseModel.A(), this.g.c));
                }
            } else {
                textView.setText(this.a.getString(R.string.mdx_minibar_last_video_text));
                textView2.setText("");
                viewGroup.setContentDescription(this.a.getString(R.string.mdx_minibar_accessibility_queue_status_last_video, this.g.c));
            }
        } else {
            WatchNextResponseModel watchNextResponseModel = adwjVar.g;
            if (watchNextResponseModel == null || (audgVar = watchNextResponseModel.g) == null || !adwa.a(audgVar.k)) {
                return;
            }
            aopu aopuVar = audgVar.i;
            String string = this.a.getString(R.string.mdx_minibar_last_video_text);
            int i = this.g.e + 1;
            while (true) {
                if (i >= aopuVar.size()) {
                    break;
                }
                audf audfVar = (audf) aopuVar.get(i);
                if ((audfVar.b & 1) != 0) {
                    audkVar = audfVar.c;
                    if (audkVar == null) {
                        audkVar = audk.a;
                    }
                } else {
                    audkVar = null;
                }
                if (audkVar == null || (audkVar.b & 1) == 0) {
                    i++;
                } else {
                    arag aragVar = audkVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    string = ajgl.b(aragVar).toString();
                }
            }
            textView.setText(c(string));
            textView2.setText(a(this.g));
            viewGroup.setContentDescription(this.a.getString(R.string.mdx_minibar_accessibility_queue_status_next_video, string, this.g.c));
        }
        if (textView.getText().toString().isEmpty()) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    @Override // defpackage.iyg
    public final void b(ViewGroup viewGroup) {
        if (!this.f) {
            if (!this.f) {
                this.c = viewGroup;
                TextView textView = (TextView) viewGroup.findViewById(R.id.minibar_title);
                textView.getClass();
                this.d = textView;
                TextView textView2 = (TextView) viewGroup.findViewById(R.id.minibar_subtitle);
                textView2.getClass();
                this.e = textView2;
                adwt adwtVar = (adwt) this.b.get();
                adwtVar.a(this);
                this.g = adwtVar.i;
                this.f = true;
            }
            int i = this.g.j;
            if (i != 0) {
                if (i == 1) {
                    d();
                    return;
                } else if (i != 2) {
                    return;
                }
            }
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setVisibility(8);
        }
    }

    @Override // defpackage.adwm
    public final void h(int i, adwj adwjVar) {
        this.g = adwjVar;
        int i2 = adwjVar.j;
        if (i2 != 0) {
            if (i2 == 1) {
                d();
                return;
            } else if (i2 != 2) {
                return;
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}
