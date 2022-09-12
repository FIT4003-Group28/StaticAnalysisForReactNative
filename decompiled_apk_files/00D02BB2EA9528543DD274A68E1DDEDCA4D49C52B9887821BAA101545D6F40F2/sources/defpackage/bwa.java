package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwa  reason: default package */
/* loaded from: classes.dex */
public final class bwa<DataType, ResourceType, Transcode> {
    public final cfv<ResourceType, Transcode> a;
    public final my<List<Throwable>> b;
    private final Class<DataType> c;
    private final List<? extends buc<DataType, ResourceType>> d;
    private final String e;

    public bwa(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends buc<DataType, ResourceType>> list, cfv<ResourceType, Transcode> cfvVar, my<List<Throwable>> myVar) {
        this.c = cls;
        this.d = list;
        this.a = cfvVar;
        this.b = myVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }

    public final bxd<ResourceType> a(bul<DataType> bulVar, int i, int i2, bua buaVar, List<Throwable> list) {
        int size = this.d.size();
        bxd<ResourceType> bxdVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            buc<DataType, ResourceType> bucVar = this.d.get(i3);
            try {
                if (bucVar.a(bulVar.a(), buaVar)) {
                    bxdVar = bucVar.b(bulVar.a(), i, i2, buaVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (bxdVar != null) {
                break;
            }
        }
        if (bxdVar != null) {
            return bxdVar;
        }
        throw new bwx(this.e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DecodePath{ dataClass=");
        sb.append(valueOf);
        sb.append(", decoders=");
        sb.append(valueOf2);
        sb.append(", transcoder=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
