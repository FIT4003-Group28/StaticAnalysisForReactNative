package defpackage;

import android.app.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnwb  reason: default package */
/* loaded from: classes3.dex */
public final class bnwb implements bnvw {
    private static final dcqe a = dcqe.c("bnwb");
    private final String b;
    private final bvrb c;
    private final Application d;

    public bnwb(Application application, String str, btrm btrmVar, bvrb bvrbVar, bnvz bnvzVar) {
        dbsk.s(application);
        this.d = application;
        dbsk.s(str);
        this.b = str;
        dbsk.s(btrmVar);
        dbsk.s(bvrbVar);
        this.c = bvrbVar;
        dbsk.s(bnvzVar);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0082: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:31:0x0082 */
    @Override // defpackage.bnvw
    public final void a(bnwl bnwlVar) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(this.b);
                    try {
                        Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream).getDocumentElement();
                        if (!documentElement.getTagName().equals("event-track")) {
                            bvoo.h("Event track must start with <%s> tag, not <%s>", "event-track", documentElement.getTagName());
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                    } catch (bnwa e) {
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        cjxu.g(this.c, this.d, "Error replaying event track");
                        if (e.getMessage() != null && e.getMessage().contains("(Permission denied)")) {
                            cjxu.g(this.c, this.d, "Enable storage permissions for app, and look in logcat output for 'external files dir'.");
                            this.d.getExternalFilesDir(null);
                        }
                        if (fileInputStream == null) {
                            return;
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    } catch (Exception unused3) {
                        fileInputStream3 = fileInputStream;
                        cjxu.g(this.c, this.d, "Error replaying event track");
                        if (fileInputStream3 == null) {
                            return;
                        }
                        try {
                            fileInputStream3.close();
                        } catch (IOException unused4) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream3 = fileInputStream2;
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
            } catch (bnwa e3) {
                throw e3;
            } catch (FileNotFoundException e4) {
                e = e4;
                fileInputStream = null;
            } catch (Exception unused6) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
