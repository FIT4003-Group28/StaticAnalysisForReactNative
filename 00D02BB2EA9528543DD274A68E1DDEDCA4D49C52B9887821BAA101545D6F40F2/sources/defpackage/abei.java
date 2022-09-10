package defpackage;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: abei  reason: default package */
/* loaded from: classes2.dex */
public class abei implements abds {
    public final abdz a;
    public final String b;
    public final dqqa c;
    public final List<dqpm> d;
    public int e;
    public abdp f;
    private final ArrayAdapter<String> g;

    public abei(gga ggaVar, abdz abdzVar, dqqa dqqaVar, String str, final int i) {
        this.e = -1;
        this.c = dqqaVar;
        dsrj<dqpm> dsrjVar = dqqaVar.b;
        this.d = dsrjVar;
        this.b = str;
        this.a = abdzVar;
        this.g = new ArrayAdapter<>(ggaVar, 17367043, dcbg.b(dsrjVar).s(abef.a).z());
        int n = dcft.n(dsrjVar, new dbsl(i) { // from class: abeg
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((dqpm) obj).a == this.a;
            }
        });
        dbsk.v(n, dsrjVar.size(), "Cannot find the daily showtimes from selected day offset");
        this.e = n;
        this.f = abdzVar.a(dsrjVar.get(n), Integer.MAX_VALUE, str, dqqaVar.f, dqqaVar.e, Collections.unmodifiableMap(dqqaVar.d));
    }

    @Override // defpackage.abds
    public SpinnerAdapter a() {
        return this.g;
    }

    @Override // defpackage.abds
    public AdapterView.OnItemSelectedListener b() {
        return new abeh(this);
    }

    @Override // defpackage.abds
    public Integer c() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.abds
    public abdp d() {
        return this.f;
    }
}
