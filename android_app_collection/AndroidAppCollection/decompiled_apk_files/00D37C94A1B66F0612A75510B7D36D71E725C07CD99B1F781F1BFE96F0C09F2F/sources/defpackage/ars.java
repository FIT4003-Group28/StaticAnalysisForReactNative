package defpackage;

import android.support.v4.os.ResultReceiver;
import android.util.Log;
/* compiled from: PG */
/* renamed from: ars  reason: default package */
/* loaded from: classes2.dex */
final class ars implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ResultReceiver b;
    final /* synthetic */ aru c;
    final /* synthetic */ arv d;
    private final /* synthetic */ int e;

    public ars(aru aruVar, arv arvVar, String str, ResultReceiver resultReceiver) {
        this.c = aruVar;
        this.d = arvVar;
        this.a = str;
        this.b = resultReceiver;
    }

    public ars(aru aruVar, arv arvVar, String str, ResultReceiver resultReceiver, int i) {
        this.e = i;
        this.c = aruVar;
        this.d = arvVar;
        this.a = str;
        this.b = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            if (((ara) this.c.a.c.get(this.d.a())) == null) {
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.a);
                return;
            }
            String str = this.a;
            aqy aqyVar = new aqy(str, this.b);
            aqyVar.h = 4;
            aqyVar.b(null);
            if (aqyVar.c()) {
                return;
            }
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
        if (((ara) this.c.a.c.get(this.d.a())) == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.a);
            return;
        }
        String str2 = this.a;
        aqx aqxVar = new aqx(str2, this.b);
        arx.c(aqxVar);
        if (aqxVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str2);
    }
}
