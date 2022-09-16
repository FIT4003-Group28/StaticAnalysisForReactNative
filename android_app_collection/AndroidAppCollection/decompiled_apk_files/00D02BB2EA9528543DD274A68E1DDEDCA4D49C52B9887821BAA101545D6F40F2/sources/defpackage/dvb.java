package defpackage;

import com.google.ar.sceneform.rendering.Material;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: dvb  reason: default package */
/* loaded from: classes6.dex */
public final class dvb {
    public static final dbgt a(Material material, float... fArr) {
        dbeb dbebVar = new dbeb();
        boolean z = true;
        if (fArr.length != 1) {
            z = false;
        }
        dbsk.b(z, "Disc must have 1 dimension parameter");
        float f = fArr[0];
        ArrayList arrayList = new ArrayList(129);
        dbif a = dbih.a();
        a.b(dbebVar);
        a.b = dbeb.p();
        a.c = new dbig(0.5f, 0.5f);
        arrayList.add(a.a());
        for (int i = 0; i <= 128; i++) {
            double d = i * 0.049087387f;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            dbeb g = dbeb.g(new dbeb(f * cos, 0.0f, f * sin), dbebVar);
            dbig dbigVar = new dbig((cos + 1.0f) / 2.0f, ((-sin) + 1.0f) / 2.0f);
            dbif a2 = dbih.a();
            a2.b(g);
            a2.b = dbeb.p();
            a2.c = dbigVar;
            arrayList.add(a2.a());
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < 128) {
            arrayList2.add(0);
            arrayList2.add(Integer.valueOf(i2 + 2));
            i2++;
            arrayList2.add(Integer.valueOf(i2));
        }
        dbhg a3 = dbhh.a();
        a3.a = arrayList2;
        a3.b = material;
        dbhh a4 = a3.a();
        dbhf a5 = dbhi.a();
        a5.a = arrayList;
        a5.b = Collections.singletonList(a4);
        try {
            dbgt dbgtVar = dbgt.c().d(a5.a()).g().get();
            dbsk.s(dbgtVar);
            return dbgtVar;
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error creating renderable.", e);
        }
    }
}
