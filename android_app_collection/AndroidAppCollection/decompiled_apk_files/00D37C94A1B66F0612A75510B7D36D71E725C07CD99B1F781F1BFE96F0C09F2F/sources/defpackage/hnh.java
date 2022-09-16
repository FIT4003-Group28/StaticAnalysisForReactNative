package defpackage;

import android.os.AsyncTask;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: hnh  reason: default package */
/* loaded from: classes3.dex */
final class hnh extends AsyncTask {
    public static final /* synthetic */ int a = 0;
    private final WeakReference b;

    public hnh(hni hniVar) {
        this.b = new WeakReference(hniVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r27) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnh.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        hni hniVar = (hni) this.b.get();
        if (hniVar == null || hniVar.n == null) {
            return;
        }
        if (!bool.booleanValue()) {
            hniVar.w.setEnabled(true);
            hqs.j(hniVar.n, true != hniVar.o.f ? R.string.reel_video_editor_fail_save_video : R.string.reel_video_editor_fail_save_photo);
            return;
        }
        hniVar.w.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 2131232420, 0, 0);
        hqs.j(hniVar.n, R.string.reel_video_editor_succeed_save_media);
        hniVar.d.postDelayed(new hng(hniVar), 2000L);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        hni hniVar = (hni) this.b.get();
        if (hniVar == null || hniVar.n == null) {
            return;
        }
        hniVar.w.setEnabled(false);
    }
}
