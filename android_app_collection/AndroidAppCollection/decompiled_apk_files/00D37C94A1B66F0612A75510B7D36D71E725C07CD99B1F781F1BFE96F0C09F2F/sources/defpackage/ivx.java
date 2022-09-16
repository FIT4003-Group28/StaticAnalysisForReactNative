package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ivx  reason: default package */
/* loaded from: classes3.dex */
public final class ivx extends ahyf {
    public int a;
    public int b;
    public String c;
    private YouTubeTextView d;
    private ProgressBar e;

    public ivx(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.remote_control_status, (ViewGroup) null);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.message);
        this.e = (ProgressBar) inflate.findViewById(R.id.progressbar);
        return inflate;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
        String string;
        zag.o(this.d, this.a != 0);
        zag.o(this.e, this.a == 2);
        YouTubeTextView youTubeTextView = this.d;
        if (TextUtils.isEmpty(this.c)) {
            string = context.getString(this.b);
        } else {
            string = context.getString(this.b, this.c);
        }
        youTubeTextView.setText(string);
    }

    @Override // defpackage.ahyf
    public final void kT() {
        this.a = 0;
        super.kT();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.a != 0;
    }
}
