package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.social.licenses.License;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: aqm  reason: default package */
/* loaded from: classes2.dex */
public final class aqm extends aqt implements Runnable {
    public boolean a;
    final /* synthetic */ aqn b;

    public aqm(aqn aqnVar) {
        this.b = aqnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqt
    public final Object a() {
        try {
            aqn aqnVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] split = vgh.c(aqnVar.f.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                int indexOf = str.indexOf(32);
                String[] split2 = str.substring(0, indexOf).split(":");
                boolean z = split2.length == 2 && indexOf > 0;
                String valueOf = String.valueOf(str);
                aqxo.z(z, valueOf.length() != 0 ? "Invalid license meta-data line:\n".concat(valueOf) : new String("Invalid license meta-data line:\n"));
                arrayList.add(new License(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return Collections.unmodifiableList(new ArrayList(treeSet));
        } catch (akq e) {
            if (!f()) {
                throw e;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqt
    public final void b(Object obj) {
        aqn aqnVar = this.b;
        if (aqnVar.a != this) {
            aqnVar.c(this);
        } else if (aqnVar.h) {
        } else {
            SystemClock.uptimeMillis();
            aqnVar.a = null;
            aqnVar.b((List) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqt
    public final void c() {
        this.b.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
