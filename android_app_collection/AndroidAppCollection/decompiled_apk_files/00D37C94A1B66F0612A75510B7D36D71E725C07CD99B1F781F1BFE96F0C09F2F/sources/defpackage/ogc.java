package defpackage;

import com.google.android.apps.youtube.app.watchwhile.StartupSignalStream;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ogc  reason: default package */
/* loaded from: classes3.dex */
public final class ogc implements yvs {
    public final Map a;
    final aypf b = new aypf();
    final ArrayList c = new ArrayList();
    private final StartupSignalStream d;
    private final ayor e;

    public ogc(Map map, StartupSignalStream startupSignalStream, ayor ayorVar) {
        this.a = map;
        this.d = startupSignalStream;
        this.e = ayorVar;
    }

    @Override // defpackage.yvs
    public final void a() {
        this.b.d(this.d.g().X(this.e).as(new ayqb() { // from class: ogb
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ogc ogcVar = ogc.this;
                yvs yvsVar = (yvs) ogcVar.a.get((auzb) obj);
                if (yvsVar != null) {
                    yvsVar.a();
                    ogcVar.c.add(yvsVar);
                }
            }
        }));
    }

    @Override // defpackage.yvs
    public final void b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((yvs) arrayList.get(i)).b();
        }
        this.c.clear();
        this.b.c();
    }
}
