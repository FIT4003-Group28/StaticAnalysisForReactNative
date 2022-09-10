package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dctj  reason: default package */
/* loaded from: classes.dex */
public final class dctj extends dcte {
    public dctj(dcrj dcrjVar, dcrp dcrpVar) {
        super(dcrjVar, dcrpVar);
        dcsk.c(dcrjVar, dcrpVar, this);
    }

    public dctj(RuntimeException runtimeException, dcrj dcrjVar, dcrp dcrpVar) {
        super(dcrjVar, dcrpVar);
        setLevel(dcrjVar.d().intValue() < Level.WARNING.intValue() ? Level.WARNING : dcrjVar.d());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        dcte.a(dcrjVar, sb);
        setMessage(sb.toString());
    }
}
