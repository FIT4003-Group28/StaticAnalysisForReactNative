package defpackage;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
/* compiled from: PG */
/* renamed from: dso  reason: default package */
/* loaded from: classes3.dex */
public final class dso {
    public static final ConditionVariable a = new ConditionVariable();
    protected static volatile rcy b = null;
    public static volatile Random c = null;
    public final dtq d;
    protected volatile Boolean e;

    public dso(dtq dtqVar) {
        this.d = dtqVar;
        dtqVar.b.execute(new dsn(this));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            a.block();
            if (!this.e.booleanValue() || b == null) {
                return;
            }
            dnm a2 = dnp.a();
            String packageName = this.d.a.getPackageName();
            a2.copyOnWrite();
            dnp.i((dnp) a2.instance, packageName);
            a2.copyOnWrite();
            dnp.c((dnp) a2.instance, j);
            if (str != null) {
                a2.copyOnWrite();
                dnp.f((dnp) a2.instance, str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                a2.copyOnWrite();
                dnp.d((dnp) a2.instance, stringWriter2);
                String name = exc.getClass().getName();
                a2.copyOnWrite();
                dnp.e((dnp) a2.instance, name);
            }
            rcx a3 = b.a(((dnp) a2.mo39build()).toByteArray());
            a3.b = i;
            if (i2 != -1) {
                a3.a = i2;
            }
            a3.a();
        } catch (Exception unused) {
        }
    }

    public final void b(int i, long j, String str) {
        a(i, -1, j, str, null);
    }
}
