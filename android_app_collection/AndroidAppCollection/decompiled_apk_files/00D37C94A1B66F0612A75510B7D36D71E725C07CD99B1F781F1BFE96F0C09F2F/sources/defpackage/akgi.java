package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akgi  reason: default package */
/* loaded from: classes.dex */
public final class akgi extends akgk {
    public akgj a;
    private ImageView d;
    private View e;
    private boolean f;
    private int g;

    public akgi(LoadingFrameLayout loadingFrameLayout, int i) {
        super(loadingFrameLayout, 3, i, R.id.error_message_text);
    }

    @Override // defpackage.akgk
    protected final View a() {
        View a = super.a();
        this.d = (ImageView) a.findViewById(R.id.error_icon);
        View findViewById = a.findViewById(R.id.error_retry_button);
        this.e = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: akgh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    akgj akgjVar = akgi.this.a;
                    if (akgjVar != null) {
                        akgjVar.qX();
                    }
                }
            });
        }
        c(this.f);
        b(this.g);
        return a;
    }

    public final void b(int i) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
        } else {
            this.g = i;
        }
    }

    public final void c(boolean z) {
        View view = this.e;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.f = z;
        }
    }
}
