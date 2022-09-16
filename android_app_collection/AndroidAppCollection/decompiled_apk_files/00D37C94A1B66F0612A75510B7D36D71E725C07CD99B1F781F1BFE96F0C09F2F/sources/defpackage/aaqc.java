package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: aaqc  reason: default package */
/* loaded from: classes.dex */
public final class aaqc {
    aopi d;
    final ampg e;
    final ampg f;
    final ampg g;
    final aopi h;
    final byte i;
    public long b = -1;
    public long c = -1;
    public String a = "";

    public aaqc(ampg ampgVar, ampg ampgVar2, ampg ampgVar3, aopi aopiVar, byte b) {
        this.e = ampgVar;
        this.f = ampgVar2;
        this.g = ampgVar3;
        this.h = aopiVar;
        this.d = aopiVar;
        this.i = b;
    }

    public final String a() {
        return Base64.encodeToString(this.d.toByteArray(), 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b = -1L;
        this.a = "";
        this.d = this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(OutputStream outputStream) {
        aopa createBuilder = apni.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        apni apniVar = (apni) createBuilder.instance;
        str.getClass();
        apniVar.b |= 2;
        apniVar.d = str;
        long j = this.b;
        createBuilder.copyOnWrite();
        apni apniVar2 = (apni) createBuilder.instance;
        apniVar2.b |= 1;
        apniVar2.c = j;
        outputStream.write(this.i);
        aaqb.b(outputStream, (apni) createBuilder.mo39build());
        aaqb.b(outputStream, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(ardu arduVar, long j) {
        String d = amps.d((String) this.g.apply(arduVar));
        if (this.a.equals(d)) {
            return false;
        }
        if (d.length() > 0) {
            this.a = d;
        }
        aoob aoobVar = (aoob) this.f.apply(arduVar);
        Object obj = null;
        if (aoobVar == null || aoobVar.d() <= 0) {
            String str = (String) this.e.apply(arduVar);
            if (!TextUtils.isEmpty(str)) {
                obj = abgb.d(abgb.f(str), this.h.getParserForType());
            }
        } else {
            try {
                obj = this.h.getParserForType().h(aoobVar);
            } catch (aopx e) {
                aaqd.d("Failed parse BytesSerialized", e);
            }
        }
        if (obj != null) {
            this.b = j;
            this.d = obj;
        }
        return obj != null || d.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(aaqb aaqbVar) {
        apni apniVar = (apni) aaqbVar.a(apni.a);
        if (apniVar != null) {
            this.a = apniVar.d;
            aoqu a = aaqbVar.a(this.h);
            if (a == null) {
                return;
            }
            this.b = apniVar.c;
            this.d = (aopi) a;
        }
    }

    public final String toString() {
        return this.h.getClass().toString();
    }
}
