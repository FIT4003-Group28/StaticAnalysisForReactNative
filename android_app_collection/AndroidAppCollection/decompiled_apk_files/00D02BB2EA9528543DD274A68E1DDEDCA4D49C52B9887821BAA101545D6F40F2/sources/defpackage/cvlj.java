package defpackage;

import android.content.Intent;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvlj  reason: default package */
/* loaded from: classes5.dex */
public final class cvlj extends cvll {
    public String a;
    public cvkc b;
    public List<cvkj> c;
    public Intent d;
    public dsbi e;
    public int f;
    private Integer g;
    private dsef h;
    private cvte i;
    private int j;

    @Override // defpackage.cvll
    public final List<cvkj> a() {
        List<cvkj> list = this.c;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"threads\" has not been set");
    }

    @Override // defpackage.cvll
    public final void c(cvte cvteVar) {
        if (cvteVar != null) {
            this.i = cvteVar;
            return;
        }
        throw new NullPointerException("Null localThreadState");
    }

    @Override // defpackage.cvll
    public final void d(dsef dsefVar) {
        if (dsefVar != null) {
            this.h = dsefVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    @Override // defpackage.cvll
    public final void e(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.cvll
    public final void f(int i) {
        if (i != 0) {
            this.j = i;
            return;
        }
        throw new NullPointerException("Null removeReason");
    }

    @Override // defpackage.cvll
    public final cvlm b() {
        String str = this.f == 0 ? " source" : "";
        if (this.g == null) {
            str = str.concat(" type");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" threads");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" threadStateUpdate");
        }
        if (this.j == 0) {
            str = String.valueOf(str).concat(" removeReason");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" localThreadState");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvlk(this.f, this.g.intValue(), this.a, this.b, this.c, this.h, this.j, this.d, this.i, this.e);
    }
}
