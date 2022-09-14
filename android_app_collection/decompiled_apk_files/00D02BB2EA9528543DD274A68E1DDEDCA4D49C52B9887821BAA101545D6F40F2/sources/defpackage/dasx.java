package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dasx  reason: default package */
/* loaded from: classes5.dex */
public class dasx extends daul implements Cloneable {
    public dasy a;

    @Override // defpackage.daul
    /* renamed from: c */
    public dasx d() {
        return (dasx) super.clone();
    }

    @Override // defpackage.daul
    /* renamed from: e */
    public void a(String str, Object obj) {
        super.a(str, obj);
    }

    public final String f() {
        dasy dasyVar = this.a;
        if (dasyVar != null) {
            return dasyVar.d(this);
        }
        return super.toString();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        dasy dasyVar = this.a;
        if (dasyVar != null) {
            try {
                return dasyVar.c(this);
            } catch (IOException e) {
                throw dbue.d(e);
            }
        }
        return super.toString();
    }
}
