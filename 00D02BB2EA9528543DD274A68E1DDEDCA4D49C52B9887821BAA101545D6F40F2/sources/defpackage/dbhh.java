package defpackage;

import com.google.ar.sceneform.rendering.Material;
import java.util.List;
/* compiled from: PG */
/* renamed from: dbhh  reason: default package */
/* loaded from: classes5.dex */
public final class dbhh {
    public final List<Integer> a;
    public Material b;
    public final String c;

    public dbhh(dbhg dbhgVar) {
        List<Integer> list = dbhgVar.a;
        dbjb.c(list);
        this.a = list;
        Material material = dbhgVar.b;
        dbjb.c(material);
        this.b = material;
        this.c = null;
    }

    public static dbhg a() {
        return new dbhg();
    }
}
