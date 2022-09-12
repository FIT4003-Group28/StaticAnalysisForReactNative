package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxa  reason: default package */
/* loaded from: classes.dex */
public final class bxa<Data, ResourceType, Transcode> {
    public final my<List<Throwable>> a;
    public final List<? extends bwa<Data, ResourceType, Transcode>> b;
    public final String c;

    public bxa(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<bwa<Data, ResourceType, Transcode>> list, my<List<Throwable>> myVar) {
        this.a = myVar;
        cjn.d(list);
        this.b = list;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed LoadPath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.c = sb.toString();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("LoadPath{decodePaths=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
