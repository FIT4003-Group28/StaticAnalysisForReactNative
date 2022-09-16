package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: vvi  reason: default package */
/* loaded from: classes4.dex */
public final class vvi implements vvs {
    public final VideoMetaData a;
    public final vvq b;
    public final vvh c = new vvh(this);
    public List d;

    public vvi(VideoMetaData videoMetaData) {
        this.a = videoMetaData;
        this.b = new vvq(videoMetaData);
    }

    @Override // defpackage.vvs
    public final vvg g(long j, boolean z) {
        synchronized (this.b) {
            vvg a = this.b.a(j, z);
            if (a != null) {
                return a.c();
            }
            return null;
        }
    }

    @Override // defpackage.vvs
    public final vvg i(long j) {
        vvg b;
        synchronized (this.b) {
            int g = this.a.g(j);
            if (g == -1 || (b = this.b.b(g)) == null) {
                return null;
            }
            return b.c();
        }
    }

    @Override // defpackage.vvs
    public final void j() {
        synchronized (this.b) {
            this.b.d();
        }
        List list = this.d;
        if (list != null) {
            list.clear();
        }
    }

    @Override // defpackage.vvs
    public final void k(vvr vvrVar) {
        if (this.d == null) {
            this.d = new CopyOnWriteArrayList();
        }
        this.d.add(vvrVar);
    }

    @Override // defpackage.vvs
    public final void l(vvr vvrVar) {
        List list = this.d;
        if (list != null) {
            list.remove(vvrVar);
        }
    }

    @Override // defpackage.vvs
    public final boolean m() {
        synchronized (this.b) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (((vvg) it.next()).f() == 1) {
                    return false;
                }
            }
            return true;
        }
    }
}
