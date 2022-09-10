package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bokf  reason: default package */
/* loaded from: classes3.dex */
public class bokf implements Serializable {
    public final List<bbtm> a = new ArrayList();
    public String b = "";

    public final void a(List<bbtm> list) {
        this.a.clear();
        this.a.addAll(list);
    }

    public final ArrayList<bbtm> b() {
        return new ArrayList<>(this.a);
    }
}
