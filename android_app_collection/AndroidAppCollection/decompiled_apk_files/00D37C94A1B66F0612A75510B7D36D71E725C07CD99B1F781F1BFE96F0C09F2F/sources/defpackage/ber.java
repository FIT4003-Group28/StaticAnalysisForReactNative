package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import androidx.mediarouter.app.MediaRouteButton;
/* compiled from: PG */
/* renamed from: ber  reason: default package */
/* loaded from: classes2.dex */
public final class ber extends AsyncTask {
    final /* synthetic */ MediaRouteButton a;
    private final int b;
    private final Context c;

    public ber(MediaRouteButton mediaRouteButton, int i, Context context) {
        this.a = mediaRouteButton;
        this.b = i;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final void onCancelled(Drawable drawable) {
        if (drawable != null) {
            MediaRouteButton.a.put(this.b, drawable.getConstantState());
        }
        this.a.c = null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (((Drawable.ConstantState) MediaRouteButton.a.get(this.b)) == null) {
            return po.b(this.c, this.b);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            onCancelled(drawable);
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.a.get(this.b);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            this.a.c = null;
        }
        this.a.f(drawable);
    }
}
