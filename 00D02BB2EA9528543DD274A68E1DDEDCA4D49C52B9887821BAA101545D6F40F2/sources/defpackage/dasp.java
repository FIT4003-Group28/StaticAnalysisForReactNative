package defpackage;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dasp  reason: default package */
/* loaded from: classes5.dex */
public final class dasp extends darr {
    private final Object a;

    public dasp(Object obj) {
        super(dasq.a);
        dbsk.s(obj);
        this.a = obj;
    }

    private static boolean f(boolean z, Writer writer, String str, Object obj) {
        if (obj == null || daub.b(obj)) {
            return z;
        }
        if (!z) {
            writer.write("&");
        }
        writer.write(str);
        String a = davc.a(obj instanceof Enum ? dauh.a((Enum) obj).c : obj.toString());
        if (a.length() != 0) {
            writer.write("=");
            writer.write(a);
        }
        return false;
    }

    @Override // defpackage.dauw
    public final void e(OutputStream outputStream) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, c()));
        boolean z = true;
        for (Map.Entry<String, Object> entry : daub.c(this.a).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String a = davc.a(entry.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object obj : dava.l(value)) {
                        z = f(z, bufferedWriter, a, obj);
                    }
                } else {
                    z = f(z, bufferedWriter, a, value);
                }
            }
        }
        bufferedWriter.flush();
    }
}
