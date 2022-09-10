package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.Writer;
/* compiled from: PG */
/* renamed from: dath  reason: default package */
/* loaded from: classes5.dex */
public final class dath extends dasy {
    private final eamp a;

    public dath() {
        eamp eampVar = new eamp();
        this.a = eampVar;
        eamr eamrVar = eamr.AUTO_CLOSE_JSON_CONTENT;
        eampVar.g = (eamrVar.i ^ (-1)) & eampVar.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static datg g(eamz eamzVar) {
        if (eamzVar == null) {
            return null;
        }
        switch (eamzVar.ordinal()) {
            case 1:
                return datg.START_OBJECT;
            case 2:
                return datg.END_OBJECT;
            case 3:
                return datg.START_ARRAY;
            case 4:
                return datg.END_ARRAY;
            case 5:
                return datg.FIELD_NAME;
            case 6:
            default:
                return datg.NOT_AVAILABLE;
            case 7:
                return datg.VALUE_STRING;
            case 8:
                return datg.VALUE_NUMBER_INT;
            case 9:
                return datg.VALUE_NUMBER_FLOAT;
            case 10:
                return datg.VALUE_TRUE;
            case 11:
                return datg.VALUE_FALSE;
            case 12:
                return datg.VALUE_NULL;
        }
    }

    @Override // defpackage.dasy
    public final datc a(InputStream inputStream) {
        dbsk.s(inputStream);
        return new datj(this, this.a.b(inputStream));
    }

    @Override // defpackage.dasy
    public final datc b(String str) {
        dbsk.s(str);
        eamp eampVar = this.a;
        StringReader stringReader = new StringReader(str);
        return new datj(this, new eanh(eamp.c(stringReader, true), eampVar.f, stringReader, eampVar.d.a(eampVar.a(eamv.CANONICALIZE_FIELD_NAMES), eampVar.a(eamv.INTERN_FIELD_NAMES))));
    }

    @Override // defpackage.dasy
    public final dasz e(OutputStream outputStream) {
        Writer outputStreamWriter;
        eams eankVar;
        eamp eampVar = this.a;
        eamo eamoVar = eamo.UTF8;
        eanm c = eamp.c(outputStream, false);
        c.b = eamoVar;
        if (eamoVar == eamo.UTF8) {
            eankVar = new eani(c, eampVar.g, outputStream);
        } else {
            if (eamoVar == eamo.UTF8) {
                outputStreamWriter = new eanr(c, outputStream);
            } else {
                outputStreamWriter = new OutputStreamWriter(outputStream, eamoVar.f);
            }
            eankVar = new eank(c, eampVar.g, outputStreamWriter);
        }
        return new dati(eankVar);
    }

    @Override // defpackage.dasy
    public final datc f(InputStream inputStream) {
        dbsk.s(inputStream);
        return new datj(this, this.a.b(inputStream));
    }
}
