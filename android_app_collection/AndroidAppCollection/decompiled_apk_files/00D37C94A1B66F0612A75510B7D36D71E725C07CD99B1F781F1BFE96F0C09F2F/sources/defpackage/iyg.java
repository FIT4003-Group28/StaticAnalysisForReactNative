package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iyg  reason: default package */
/* loaded from: classes3.dex */
public abstract class iyg implements adwm {
    protected final Context a;
    protected final azqb b;
    protected ViewGroup c;
    protected TextView d;
    protected TextView e;
    protected boolean f;
    protected adwj g = adwj.a().a();

    /* JADX INFO: Access modifiers changed from: protected */
    public iyg(Context context, azqb azqbVar) {
        this.a = context;
        this.b = azqbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(adwj adwjVar) {
        int i = adwjVar.e;
        int i2 = adwjVar.d;
        return (i >= i2 || i2 == 0) ? "" : this.a.getString(R.string.mdx_minibar_queue_status, String.valueOf(i + 1), String.valueOf(adwjVar.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(ViewGroup viewGroup) {
        throw null;
    }
}
