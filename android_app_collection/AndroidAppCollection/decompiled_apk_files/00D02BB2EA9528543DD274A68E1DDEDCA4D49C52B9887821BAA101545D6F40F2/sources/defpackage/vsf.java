package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vsf  reason: default package */
/* loaded from: classes7.dex */
public final class vsf implements vtn {
    public final Executor a;
    public final Context b;
    final Application.ActivityLifecycleCallbacks c;
    public final ConcurrentMap<dbsi<String, dvxj>, dvxl> d;
    private final amfi e;
    private final gce f;

    public vsf(Application application, Executor executor, amfi amfiVar, gce gceVar) {
        vry vryVar = new vry(this);
        this.c = vryVar;
        this.d = dcjz.j();
        this.a = executor;
        this.e = amfiVar;
        this.b = application;
        this.f = gceVar;
        application.registerActivityLifecycleCallbacks(vryVar);
    }

    @Override // defpackage.vtn
    @dzsi
    public final String a(String str, vtj vtjVar) {
        dvxj dvxjVar;
        ConcurrentMap<dbsi<String, dvxj>, dvxl> concurrentMap = this.d;
        vtj vtjVar2 = vtj.TRANSIT_AUTO;
        int ordinal = vtjVar.ordinal();
        if (ordinal == 1) {
            dvxjVar = dvxj.SVG_LIGHT;
        } else if (ordinal == 2) {
            dvxjVar = dvxj.SVG_DARK;
        } else if (ordinal == 3) {
            dvxjVar = dvxj.SVG_INCIDENT_LIGHT;
        } else if (this.f.h()) {
            dvxjVar = dvxj.SVG_DARK;
        } else {
            dvxjVar = dvxj.SVG_LIGHT;
        }
        dvxl dvxlVar = concurrentMap.get(dbsi.a(str, dvxjVar));
        if (dvxlVar == null) {
            return null;
        }
        return dvxlVar.d;
    }

    @Override // defpackage.vtn
    @dzsi
    public final Drawable b(String str, vtj vtjVar, @dzsi vtl vtlVar) {
        String a = a(str, vtjVar);
        if (a == null) {
            return null;
        }
        cqtd i = this.e.h(a, "DIRECTIONS_ICON_MANAGER_IMPL", vtlVar != null ? new vsa(this, vtlVar) : null).i(bvlw.a);
        if (i != null) {
            return i.a(this.b);
        }
        return null;
    }

    @Override // defpackage.vtn
    @dzsi
    public final cqtd c(String str) {
        amfu h = this.e.h(str, "DIRECTIONS_ICON_MANAGER_IMPL", null);
        if (h == null) {
            return null;
        }
        return h.j();
    }

    @Override // defpackage.vtn
    @dzsi
    public final cqtd d(String str, vtj vtjVar, bvlw bvlwVar) {
        String a = a(str, vtjVar);
        if (a == null) {
            return null;
        }
        return e(a, bvlwVar);
    }

    @Override // defpackage.vtn
    @dzsi
    public final cqtd e(String str, bvlw bvlwVar) {
        return f(str, bvlwVar, null);
    }

    @Override // defpackage.vtn
    @dzsi
    public final cqtd f(String str, bvlw bvlwVar, @dzsi vtk vtkVar) {
        amfu h = this.e.h(str, "DIRECTIONS_ICON_MANAGER_IMPL", vtkVar != null ? new vsc(this, bvlwVar, vtkVar) : null);
        if (h == null) {
            return null;
        }
        return h.i(bvlwVar);
    }

    @Override // defpackage.vtn
    @dzsi
    public final Drawable g(String str, bvlw bvlwVar) {
        cqtd e = e(str, bvlwVar);
        if (e == null) {
            return null;
        }
        return e.a(this.b);
    }

    @Override // defpackage.vtn
    public final void h(Collection<String> collection, @dzsi final vti vtiVar) {
        dbsk.s(collection);
        if (collection.isEmpty()) {
            if (vtiVar == null) {
                return;
            }
            Executor executor = this.a;
            vtiVar.getClass();
            executor.execute(new Runnable(vtiVar) { // from class: vrx
                private final vti a;

                {
                    this.a = vtiVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
            return;
        }
        vse vseVar = vtiVar == null ? null : new vse(this, vtiVar, collection.size());
        HashSet hashSet = new HashSet();
        for (String str : collection) {
            amfu h = this.e.h(str, "DIRECTIONS_ICON_MANAGER_IMPL", vseVar);
            if (vseVar != null && h.a()) {
                vseVar.a(h);
            }
            hashSet.add(h);
        }
        if (vseVar == null) {
            return;
        }
        int size = hashSet.size();
        synchronized (vseVar.a) {
            int i = vseVar.c;
            if (i == size) {
                return;
            }
            boolean z = true;
            dbsk.a(size < i);
            vseVar.c = size;
            if (vseVar.b.size() > size) {
                z = false;
            }
            dbsk.m(z, "Handled too many resources");
            vseVar.b();
        }
    }

    @Override // defpackage.vtn
    public final void i(Collection<String> collection, File file) {
        if (collection.isEmpty()) {
            return;
        }
        if (!file.exists()) {
            throw new IllegalStateException("Icons directory does not exist.");
        }
        for (String str : collection) {
            amfu h = this.e.h(str, "DIRECTIONS_ICON_MANAGER_IMPL", null);
            if (h.a() && h.b() == 6) {
                try {
                    File file2 = new File(file, Base64.encodeToString(str.getBytes("UTF-8"), 8));
                    try {
                        byte[] bArr = h.d;
                        if (bArr != null) {
                            ddau.e(bArr, file2);
                        }
                    } catch (IOException unused) {
                        file2.getAbsolutePath();
                    }
                } catch (UnsupportedEncodingException unused2) {
                }
            }
        }
    }

    @Override // defpackage.vtn
    public final void j(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return;
        }
        for (File file2 : file.listFiles()) {
            try {
                String str = new String(Base64.decode(file2.getName(), 8), "UTF-8");
                byte[] d = ddau.d(file2);
                amfu amfuVar = new amfu(str);
                amfuVar.d = d;
                amfuVar.c(6);
                amfuVar.e = new amft(amfuVar, d);
                amfuVar.e(false);
                this.e.j(str, amfuVar);
            } catch (UnsupportedEncodingException unused) {
            } catch (IOException unused2) {
                file2.getAbsolutePath();
            }
        }
    }

    @Override // defpackage.vtn
    public final void k(Collection<dvxl> collection) {
        for (dvxl dvxlVar : collection) {
            int i = dvxlVar.a;
            if ((i & 1) != 0 && (i & 2) != 0 && (i & 4) != 0) {
                ConcurrentMap<dbsi<String, dvxj>, dvxl> concurrentMap = this.d;
                String str = dvxlVar.b;
                dvxj b = dvxj.b(dvxlVar.c);
                if (b == null) {
                    b = dvxj.PIXEL_15;
                }
                concurrentMap.put(dbsi.a(str, b), dvxlVar);
            }
        }
    }

    @Override // defpackage.vtn
    public final void l(Collection<dvxl> collection) {
        dbsk.s(collection);
        k(collection);
        ArrayList arrayList = new ArrayList();
        for (dvxl dvxlVar : collection) {
            arrayList.add(dvxlVar.d);
        }
        h(arrayList, null);
    }
}
