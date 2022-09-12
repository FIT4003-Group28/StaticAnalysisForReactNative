package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgq  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbgq implements Cloneable {
    public String e;

    public abstract void a(MaterialInstance materialInstance);

    @Override // 
    /* renamed from: b */
    public dbgq clone() {
        try {
            return (dbgq) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
