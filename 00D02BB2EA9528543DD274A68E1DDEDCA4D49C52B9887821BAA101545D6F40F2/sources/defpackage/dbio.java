package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.OptionalInt;
/* compiled from: PG */
/* renamed from: dbio  reason: default package */
/* loaded from: classes5.dex */
public final class dbio extends dbhd<dbip, dbio> {
    public View f;
    public final dbis g = new dbeq();
    public final int h = 1;
    public final int i = 2;
    private final OptionalInt j = OptionalInt.empty();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbhd
    public final Class<dbip> a() {
        return dbip.class;
    }

    @Override // defpackage.dbhd
    protected final dbiv<dbip> b() {
        return dbhs.b().e;
    }

    @Override // defpackage.dbhd
    protected final /* bridge */ /* synthetic */ dbip c() {
        dbip dbipVar;
        View view = this.f;
        if (view != null) {
            dbipVar = new dbip(this, view);
        } else {
            Context context = this.b;
            if (context == null) {
                throw new AssertionError("Context cannot be null");
            }
            dbipVar = new dbip(this, LayoutInflater.from(this.b).inflate(this.j.getAsInt(), (ViewGroup) new FrameLayout(context), false));
        }
        return dbipVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbhd
    public final void f() {
        super.f();
        if (this.j.isPresent() || this.f != null) {
            if (this.j.isPresent() && this.f != null) {
                throw new AssertionError("ViewRenderable must have a resourceId or a view as a source. This one has both.");
            }
            return;
        }
        throw new AssertionError("ViewRenderable must have a source.");
    }
}
