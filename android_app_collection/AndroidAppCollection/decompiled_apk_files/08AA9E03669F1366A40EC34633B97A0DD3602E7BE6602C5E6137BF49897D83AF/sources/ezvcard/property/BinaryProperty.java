package ezvcard.property;

import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.internal.ImagesContract;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.parameter.Pid;
import ezvcard.util.e;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class BinaryProperty<T extends MediaTypeParameter> extends VCardProperty implements HasAltId {
    protected T contentType;
    protected byte[] data;
    protected String url;

    public BinaryProperty() {
    }

    public BinaryProperty(String str, T t) {
        setUrl(str, t);
    }

    public BinaryProperty(byte[] bArr, T t) {
        setData(bArr, t);
    }

    public BinaryProperty(InputStream inputStream, T t) {
        this(new e(inputStream).a(), t);
    }

    public BinaryProperty(File file, T t) {
        this(new BufferedInputStream(new FileInputStream(file)), t);
    }

    public BinaryProperty(BinaryProperty<T> binaryProperty) {
        super(binaryProperty);
        this.data = binaryProperty.data == null ? null : (byte[]) binaryProperty.data.clone();
        this.url = binaryProperty.url;
        this.contentType = binaryProperty.contentType;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] bArr, T t) {
        this.url = null;
        this.data = bArr;
        setContentType(t);
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str, T t) {
        this.url = str;
        this.data = null;
        setContentType(t);
    }

    public T getContentType() {
        return this.contentType;
    }

    public void setContentType(T t) {
        this.contentType = t;
    }

    public String getType() {
        return this.parameters.o();
    }

    public void setType(String str) {
        this.parameters.f(str);
    }

    @Override // ezvcard.property.VCardProperty
    public List<Pid> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.a();
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.a2(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.url == null && this.data == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.VCardProperty
    public Map<String, Object> toStringValues() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.data == null) {
            str = "null";
        } else {
            str = "length: " + this.data.length;
        }
        linkedHashMap.put(DataBufferSafeParcelable.DATA_FIELD, str);
        linkedHashMap.put(ImagesContract.URL, this.url);
        linkedHashMap.put("contentType", this.contentType);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((((super.hashCode() * 31) + (this.contentType == null ? 0 : this.contentType.hashCode())) * 31) + Arrays.hashCode(this.data)) * 31;
        if (this.url != null) {
            i = this.url.hashCode();
        }
        return hashCode + i;
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        BinaryProperty binaryProperty = (BinaryProperty) obj;
        if (this.contentType == null) {
            if (binaryProperty.contentType != null) {
                return false;
            }
        } else if (!this.contentType.equals(binaryProperty.contentType)) {
            return false;
        }
        if (!Arrays.equals(this.data, binaryProperty.data)) {
            return false;
        }
        if (this.url == null) {
            if (binaryProperty.url != null) {
                return false;
            }
        } else if (!this.url.equals(binaryProperty.url)) {
            return false;
        }
        return true;
    }
}
