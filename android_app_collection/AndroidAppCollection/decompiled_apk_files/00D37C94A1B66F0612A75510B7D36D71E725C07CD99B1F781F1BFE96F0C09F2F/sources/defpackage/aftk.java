package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aftk  reason: default package */
/* loaded from: classes.dex */
public class aftk implements afts {
    /* JADX INFO: Access modifiers changed from: protected */
    public static final void h(yrb yrbVar) {
        int i = yrbVar.a;
        if (i >= 300) {
            yrc yrcVar = new yrc(i, yrbVar.b);
            try {
                yqz yqzVar = yrbVar.d;
                if (yqzVar != null) {
                    yqzVar.f();
                }
            } catch (IOException unused) {
            }
            throw yrcVar;
        }
    }

    @Override // defpackage.afts
    /* renamed from: d */
    public Object b(yrb yrbVar) {
        h(yrbVar);
        return f(yrbVar.d);
    }

    protected Object g(InputStream inputStream) {
        try {
            inputStream.close();
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object f(yqz yqzVar) {
        if (yqzVar == null) {
            throw new IOException("Empty response body");
        }
        return g(yqzVar.b());
    }
}
