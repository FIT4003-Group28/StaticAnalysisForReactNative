package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogRecord;
/* compiled from: PG */
/* renamed from: dcte  reason: default package */
/* loaded from: classes.dex */
public class dcte extends LogRecord {
    private static final Object[] a;
    private final dcrj b;
    private final dcrp c;

    static {
        new dctd();
        a = new Object[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dcte(dcrj dcrjVar, dcrp dcrpVar) {
        super(dcrjVar.d(), null);
        this.b = dcrjVar;
        this.c = dcrpVar;
        dcqp g = dcrjVar.g();
        setSourceClassName(g.a());
        setSourceMethodName(g.b());
        setLoggerName(dcrjVar.f());
        setMillis(TimeUnit.NANOSECONDS.toMillis(dcrjVar.e()));
        super.setParameters(a);
    }

    public static void a(dcrj dcrjVar, StringBuilder sb) {
        Object[] i;
        sb.append("  original message: ");
        if (dcrjVar.h() == null) {
            sb.append(dcrn.a(dcrjVar.j()));
        } else {
            sb.append(dcrjVar.h().b);
            sb.append("\n  original arguments:");
            for (Object obj : dcrjVar.i()) {
                sb.append("\n    ");
                sb.append(dcrn.a(obj));
            }
        }
        dcrp l = dcrjVar.l();
        if (l.a() > 0) {
            sb.append("\n  metadata:");
            for (int i2 = 0; i2 < l.a(); i2++) {
                sb.append("\n    ");
                sb.append(l.b(i2).a);
                sb.append(": ");
                sb.append(dcrn.a(l.c(i2)));
            }
        }
        sb.append("\n  level: ");
        sb.append(dcrn.a(dcrjVar.d()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(dcrjVar.e());
        sb.append("\n  class: ");
        sb.append(dcrjVar.g().a());
        sb.append("\n  method: ");
        sb.append(dcrjVar.g().b());
        sb.append("\n  line number: ");
        sb.append(dcrjVar.g().c());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message != null) {
            return message;
        }
        dcrk dcrkVar = dcsk.a;
        String b = dcsk.b(this.b, this.c);
        super.setMessage(b);
        return b;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = a;
        }
        super.setParameters(objArr);
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.b, sb);
        sb.append("\n}");
        return sb.toString();
    }
}
