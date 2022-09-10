package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: PG */
/* renamed from: crbu  reason: default package */
/* loaded from: classes5.dex */
public final class crbu implements crdh {
    public final crby a;
    @dzsi
    public crbx b;
    private final crco c;
    private final btvo d;
    private final bvjj e;
    private final crbt f = new crbt(this);

    public crbu(crco crcoVar, crby crbyVar, btvo btvoVar, bvjj bvjjVar) {
        this.d = btvoVar;
        this.c = crcoVar;
        this.a = crbyVar;
        this.e = bvjjVar;
    }

    @dzsi
    private final crbc g(amsv amsvVar) {
        crbw crbwVar;
        if (amsvVar instanceof amss) {
            amsv[] amsvVarArr = ((amss) amsvVar).a;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (amsv amsvVar2 : amsvVarArr) {
                crbc g = g(amsvVar2);
                if (!amsvVar2.a() || (g != null && !(g instanceof crdk))) {
                    if (g == null) {
                        return null;
                    }
                    if (g instanceof crdk) {
                        return g;
                    }
                    arrayList.add(g);
                } else if (g instanceof crdk) {
                    z = true;
                }
            }
            if (arrayList.isEmpty()) {
                if (!z) {
                    return null;
                }
                return new crdk();
            } else if (arrayList.size() == 1) {
                return (crbc) arrayList.get(0);
            } else {
                return new crcg((crbc[]) arrayList.toArray(new crbc[arrayList.size()]));
            }
        }
        crbx crbxVar = this.b;
        if (crbxVar == null) {
            return null;
        }
        int i = ((amsu) amsvVar).a;
        if (i == 0) {
            crbwVar = crbw.d;
        } else {
            Map<Integer, String> map = crbxVar.a;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                String str = crbxVar.a.get(valueOf);
                if (str == null) {
                    crbwVar = crbw.d;
                } else {
                    String str2 = crbxVar.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + str.length());
                    sb.append(str2);
                    sb.append("/._");
                    sb.append(str);
                    File file = new File(sb.toString());
                    if (!file.exists()) {
                        ZipFile zipFile = crbxVar.c;
                        if (zipFile != null) {
                            try {
                                ZipEntry entry = zipFile.getEntry(str);
                                if (entry != null) {
                                    crbv crbvVar = new crbv(crbxVar.c, entry);
                                    ddaf b = ddau.b(file, new ddar[0]);
                                    ddaq a = ddaq.a();
                                    InputStream inputStream = crbvVar.a.getInputStream(crbvVar.b);
                                    if (inputStream != null) {
                                        a.c(inputStream);
                                        FileOutputStream a2 = ((ddas) b).a();
                                        a.c(a2);
                                        long a3 = ddak.a(inputStream, a2);
                                        a.close();
                                        if (a3 != entry.getSize()) {
                                            throw new IOException("Copy incomplete");
                                        }
                                    } else {
                                        throw new IOException("Error creating input stream from bundle");
                                    }
                                }
                            } catch (IOException unused) {
                                file.delete();
                            }
                        }
                        file = null;
                    }
                    crbwVar = crbw.a(file);
                }
            } else {
                crbwVar = crbw.c;
            }
        }
        if (crbwVar.a) {
            return new crdk();
        }
        File file2 = crbwVar.b;
        if (file2 == null) {
            return null;
        }
        return this.c.b(file2, cres.a(this.e), 3);
    }

    @Override // defpackage.crbl
    @dzsi
    public final crbc a(crfj crfjVar) {
        synchronized (this.a) {
            if (this.b != null || d(Locale.getDefault())) {
                dbsk.s(this.b);
                amsv amsvVar = crfjVar.d;
                if (amsvVar == null) {
                    return null;
                }
                return g(amsvVar);
            }
            return null;
        }
    }

    @Override // defpackage.crbl
    public final void b() {
        throw null;
    }

    @Override // defpackage.crbl
    public final void c() {
        synchronized (this.a) {
            crbx crbxVar = this.b;
            if (crbxVar != null) {
                try {
                    crbxVar.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    @Override // defpackage.crdh
    public final boolean d(Locale locale) {
        boolean z;
        synchronized (this.a) {
            String z2 = this.e.z(bvjk.eK, "");
            if (!z2.isEmpty()) {
                Iterator<dwki> it = this.d.getTextToSpeechParameters().h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.e.ac(bvjk.eK, "");
                        break;
                    } else if (it.next().c.equals(z2)) {
                        break;
                    }
                }
            }
            if (!bvog.a()) {
                this.b = null;
            } else {
                crbx crbxVar = this.b;
                if (crbxVar != null) {
                    try {
                        crbxVar.close();
                    } catch (IOException unused) {
                    }
                }
                this.b = this.a.a(locale, this.f);
            }
            z = this.b != null;
        }
        return z;
    }

    @Override // defpackage.crdj
    public final void e(crfj crfjVar, @dzsi crdg crdgVar, cksq cksqVar) {
        throw null;
    }

    @Override // defpackage.crdj
    public final void f(Locale locale) {
        d(locale);
    }
}
