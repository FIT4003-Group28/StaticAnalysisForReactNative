package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dalk  reason: default package */
/* loaded from: classes5.dex */
final class dalk implements Runnable {
    final /* synthetic */ dalt a;
    final /* synthetic */ dall b;

    public dalk(dall dallVar, dalt daltVar) {
        this.b = dallVar;
        this.a = daltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dalh dalhVar = this.b.a;
        dalt daltVar = this.a;
        List<String> list = daltVar.a;
        List<String> f = dall.f(daltVar.b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(list));
        }
        if (!f.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(f));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        dalhVar.f(dame.k(bundle));
    }
}
