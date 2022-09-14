package a.n.b;

import a.n.b.c;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
/* loaded from: classes.dex */
public class b extends a<Cursor> {
    final c<Cursor>.a p;
    Uri q;
    String[] r;
    String s;
    String[] t;
    String u;
    Cursor v;
    a.g.j.b w;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.p = new c.a();
        this.q = uri;
        this.r = strArr;
        this.s = str;
        this.t = strArr2;
        this.u = str2;
    }

    @Override // a.n.b.c
    /* renamed from: a */
    public void b(Cursor cursor) {
        if (h()) {
            if (cursor == null) {
                return;
            }
            cursor.close();
            return;
        }
        Cursor cursor2 = this.v;
        this.v = cursor;
        if (i()) {
            super.b((b) cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // a.n.b.a, a.n.b.c
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f478h);
    }

    @Override // a.n.b.a
    /* renamed from: b */
    public void c(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.n.b.c
    public void n() {
        super.n();
        p();
        Cursor cursor = this.v;
        if (cursor != null && !cursor.isClosed()) {
            this.v.close();
        }
        this.v = null;
    }

    @Override // a.n.b.c
    protected void o() {
        Cursor cursor = this.v;
        if (cursor != null) {
            b(cursor);
        }
        if (u() || this.v == null) {
            e();
        }
    }

    @Override // a.n.b.c
    protected void p() {
        b();
    }

    @Override // a.n.b.a
    public void v() {
        super.v();
        synchronized (this) {
            if (this.w != null) {
                this.w.a();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // a.n.b.a
    /* renamed from: y */
    public Cursor mo18y() {
        synchronized (this) {
            if (x()) {
                throw new a.g.j.c();
            }
            this.w = new a.g.j.b();
        }
        try {
            Cursor a2 = a.g.e.a.a(f().getContentResolver(), this.q, this.r, this.s, this.t, this.u, this.w);
            if (a2 != null) {
                try {
                    a2.getCount();
                    a2.registerContentObserver(this.p);
                } catch (RuntimeException e2) {
                    a2.close();
                    throw e2;
                }
            }
            synchronized (this) {
                this.w = null;
            }
            return a2;
        } catch (Throwable th) {
            synchronized (this) {
                this.w = null;
                throw th;
            }
        }
    }
}
